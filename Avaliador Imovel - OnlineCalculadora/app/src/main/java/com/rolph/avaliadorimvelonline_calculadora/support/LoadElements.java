package com.rolph.avaliadorimvelonline_calculadora.support;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.view.Display;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.rolph.avaliadorimvelonline_calculadora.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class LoadElements extends Context {
    //INSTÂNIAS

    //MOTIVO
    EditText areaMotivo;
    Spinner vagaGaragemMotivo;
    Spinner padraoAcabamentoMotivo;
    Spinner estadoConservacaoMotivo;

    //AMOSTRA 1
    EditText valorAmostra1;
    EditText areaAmostra1;
    Spinner vagaGaragemAmostra1;
    Spinner padraoAcabamentoAmostra1;
    Spinner estadoConservacaoAmostra1;

    //AMOSTRA 2
    EditText valorAmostra2;
    EditText areaAmostra2;
    Spinner vagaGaragemAmostra2;
    Spinner padraoAcabamentoAmostra2;
    Spinner estadoConservacaoAmostra2;

    //AMOSTRA 3
    EditText valorAmostra3;
    EditText areaAmostra3;
    Spinner vagaGaragemAmostra3;
    Spinner padraoAcabamentoAmostra3;
    Spinner estadoConservacaoAmostra3;

    Button calculateButton;

    private ArrayAdapter getAdapter1(Object activ){
        ArrayAdapter adapter = loadArray(activ, R.array.number_parking_spaces);
        return adapter;
    }
    private ArrayAdapter getAdapter2(Object activ){
        ArrayAdapter adapter = loadArray(activ, R.array.standard_finish);
        return adapter;
    }
    private ArrayAdapter getAdapter3(Object activ){
        ArrayAdapter adapter = loadArray(activ, R.array.quality_level);
        return adapter;
    }

    private ArrayAdapter loadArray (Object activ, int array){
        /*Referencias:
        Controle Spinner
        https://developer.android.com/guide/topics/ui/controls/spinner#java*/

        ArrayAdapter<CharSequence> adapter;
        adapter = ArrayAdapter.createFromResource((Context) activ,
                array,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return adapter;
    }

    //REASON
    public Double getAreAMotivo () {
        return Double.valueOf(areaMotivo.getText().toString());
    }
    public void setAreaMotivo(EditText area_motivo) {
        this.areaMotivo = area_motivo;
    }

    public Double getVagaGaragemMotivo() {
        return Double.valueOf(vagaGaragemMotivo.getSelectedItem().toString());
    }
    public void setVagaGaragemMotivo(Object activ, Spinner vaga_garagem) {
        this.vagaGaragemMotivo = vaga_garagem;
        this.vagaGaragemMotivo.setAdapter(getAdapter1(activ));
    }

    public Double getPadraoAcabamentoMotivo() {
        Calculation calculation = new Calculation();
        return (double) calculation.levelConverter(padraoAcabamentoMotivo.getSelectedItemPosition());
        //return Double.valueOf(padraoAcabamentoMotivo.getSelectedItem().toString());
    }
    public void setPadraoAcabamentoMotivo(Object activ, Spinner padrao_acabamento) {
        this.padraoAcabamentoMotivo = padrao_acabamento;
        this.padraoAcabamentoMotivo.setAdapter(getAdapter2(activ));
    }

    public Double getEstadoConservacaoMotivo() {
        return Double.valueOf(estadoConservacaoMotivo.getSelectedItem().toString());
    }
    public void setEstadoConservacaoMotivo(Object activ, Spinner estado_conservacao) {
        this.estadoConservacaoMotivo = estado_conservacao;
        this.estadoConservacaoMotivo.setAdapter(getAdapter3(activ));
    }

    //SAMPLE 1
    public Double getValorAmostra1() {
        return Double.valueOf(valorAmostra1.getText().toString());
    }
    public EditText getValorAmostra1tx (){
        return valorAmostra1;
    }
    public void setValorAmostra1(EditText valor_amostra) {
        this.valorAmostra1 = valor_amostra;
    }

    public Double getAreaAmostra1() {
        return Double.valueOf(areaAmostra1.getText().toString());
    }
    public void setAreaAmostra1(EditText area_amostra) {
        this.areaAmostra1 = area_amostra;
    }

    public Double getVagaGaragemAmostra1() {
        return Double.valueOf(vagaGaragemAmostra1.getSelectedItem().toString());
    }
    public void setVagaGaragemAmostra1(Object activ, Spinner vaga_amostra) {
        this.vagaGaragemAmostra1 = vaga_amostra;
        this.vagaGaragemAmostra1.setAdapter(getAdapter1(activ));
    }

    public Double getPadraoAcabamentoAmostra1() {
        return Double.valueOf(padraoAcabamentoAmostra1.getSelectedItem().toString());
    }
    public void setPadraoAcabamentoAmostra1(Object activ, Spinner padrão_acabamento) {
        this.padraoAcabamentoAmostra1 = padrão_acabamento;
        this.padraoAcabamentoAmostra1.setAdapter(getAdapter2(activ));
    }

    public Double getEstadoConservacaoAmostra1() {
        return Double.valueOf(estadoConservacaoAmostra1.getSelectedItem().toString());
    }
    public void setEstadoConservacaoAmostra1(Object activ, Spinner estado_conservacao) {
        this.estadoConservacaoAmostra1 = estado_conservacao;
        this.estadoConservacaoAmostra1.setAdapter(getAdapter3(activ));
    }

    //SAMPLE 2
    public Double getValorAmostra2() {
        return Double.valueOf(valorAmostra2.getText().toString());
    }
    public EditText getValorAmostra2tx (){
        return valorAmostra2;
    }
    public void setValorAmostra2(EditText valor_amostra) {
        this.valorAmostra2 = valor_amostra;
    }

    public Double getAreaAmostra2() {
        return Double.valueOf(areaAmostra1.getText().toString());
    }
    public void setAreaAmostra2(EditText area_amostra) {
        this.areaAmostra2 = area_amostra;
    }

    public Double getVagaGaragemAmostra2() {
        return Double.valueOf(vagaGaragemAmostra2.getSelectedItem().toString());
    }
    public void setVagaGaragemAmostra2(Object activ, Spinner vaga_amostra) {
        this.vagaGaragemAmostra2 = vaga_amostra;
        this.vagaGaragemAmostra2.setAdapter(getAdapter1(activ));
    }

    public Double getPadraoAcabamentoAmostra2() {
        return Double.valueOf(padraoAcabamentoAmostra1.getSelectedItem().toString());
    }
    public void setPadraoAcabamentoAmostra2(Object activ, Spinner padrão_acabamento) {
        this.padraoAcabamentoAmostra2 = padrão_acabamento;
        this.padraoAcabamentoAmostra2.setAdapter(getAdapter2(activ));
    }

    public Double getEstadoConservacaoAmostra2() {
        return Double.valueOf(estadoConservacaoAmostra2.getSelectedItem().toString());
    }
    public void setEstadoConservacaoAmostra2(Object activ, Spinner estado_conservacao) {
        this.estadoConservacaoAmostra2 = estado_conservacao;
        this.estadoConservacaoAmostra2.setAdapter(getAdapter3(activ));
    }

    //SAMPLE 3
    public Double getValorAmostra3() {
        return Double.valueOf(valorAmostra3.getText().toString());
    }
    public EditText getValorAmostra3tx (){
        return valorAmostra3;
    }
    public void setValorAmostra3(EditText valor_amostra) {
        this.valorAmostra3 = valor_amostra;
    }

    public Double getAreaAmostra3() {
        return Double.valueOf(areaAmostra3.getText().toString());
    }
    public void setAreaAmostra3(EditText area_amostra) {
        this.areaAmostra3 = area_amostra;
    }

    public Double getVagaGaragemAmostra3() {
        return Double.valueOf(vagaGaragemAmostra3.getSelectedItem().toString());
    }
    public void setVagaGaragemAmostra3(Object activ, Spinner vaga_amostra) {
        this.vagaGaragemAmostra3 = vaga_amostra;
        this.vagaGaragemAmostra3.setAdapter(getAdapter1(activ));
    }

    public Double getPadraoAcabamentoAmostra3() {
        return Double.valueOf(padraoAcabamentoAmostra3.getSelectedItem().toString());
    }
    public void setPadraoAcabamentoAmostra3(Object activ, Spinner padrão_acabamento) {
        this.padraoAcabamentoAmostra3 = padrão_acabamento;
        this.padraoAcabamentoAmostra3.setAdapter(getAdapter2(activ));
    }

    public Double getEstadoConservacaoAmostra3() {
        return Double.valueOf(estadoConservacaoAmostra3.getSelectedItem().toString());
    }
    public void setEstadoConservacaoAmostra3(Object activ, Spinner estado_conservacao) {
        this.estadoConservacaoAmostra3 = estado_conservacao;
        this.estadoConservacaoAmostra3.setAdapter(getAdapter3(activ));
    }

    public Button getCalculateButton() {
        return calculateButton;
    }

    public void setCalculateButton(Button button) {
        this.calculateButton = button;
    }

    @Override
    public AssetManager getAssets() {
        return null;
    }

    @Override
    public Resources getResources() {
        return null;
    }

    @Override
    public PackageManager getPackageManager() {
        return null;
    }

    @Override
    public ContentResolver getContentResolver() {
        return null;
    }

    @Override
    public Looper getMainLooper() {
        return null;
    }

    @Override
    public Context getApplicationContext() {
        return null;
    }

    @Override
    public void setTheme(int resid) {

    }

    @Override
    public Resources.Theme getTheme() {
        return null;
    }

    @Override
    public ClassLoader getClassLoader() {
        return null;
    }

    @Override
    public String getPackageName() {
        return null;
    }

    @Override
    public ApplicationInfo getApplicationInfo() {
        return null;
    }

    @Override
    public String getPackageResourcePath() {
        return null;
    }

    @Override
    public String getPackageCodePath() {
        return null;
    }

    @Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return null;
    }

    @Override
    public boolean moveSharedPreferencesFrom(Context sourceContext, String name) {
        return false;
    }

    @Override
    public boolean deleteSharedPreferences(String name) {
        return false;
    }

    @Override
    public FileInputStream openFileInput(String name) throws FileNotFoundException {
        return null;
    }

    @Override
    public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException {
        return null;
    }

    @Override
    public boolean deleteFile(String name) {
        return false;
    }

    @Override
    public File getFileStreamPath(String name) {
        return null;
    }

    @Override
    public File getDataDir() {
        return null;
    }

    @Override
    public File getFilesDir() {
        return null;
    }

    @Override
    public File getNoBackupFilesDir() {
        return null;
    }

    @Nullable
    @Override
    public File getExternalFilesDir(@Nullable String type) {
        return null;
    }

    @Override
    public File[] getExternalFilesDirs(String type) {
        return new File[0];
    }

    @Override
    public File getObbDir() {
        return null;
    }

    @Override
    public File[] getObbDirs() {
        return new File[0];
    }

    @Override
    public File getCacheDir() {
        return null;
    }

    @Override
    public File getCodeCacheDir() {
        return null;
    }

    @Nullable
    @Override
    public File getExternalCacheDir() {
        return null;
    }

    @Override
    public File[] getExternalCacheDirs() {
        return new File[0];
    }

    @Override
    public File[] getExternalMediaDirs() {
        return new File[0];
    }

    @Override
    public String[] fileList() {
        return new String[0];
    }

    @Override
    public File getDir(String name, int mode) {
        return null;
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory) {
        return null;
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory, @Nullable DatabaseErrorHandler errorHandler) {
        return null;
    }

    @Override
    public boolean moveDatabaseFrom(Context sourceContext, String name) {
        return false;
    }

    @Override
    public boolean deleteDatabase(String name) {
        return false;
    }

    @Override
    public File getDatabasePath(String name) {
        return null;
    }

    @Override
    public String[] databaseList() {
        return new String[0];
    }

    @Override
    public Drawable getWallpaper() {
        return null;
    }

    @Override
    public Drawable peekWallpaper() {
        return null;
    }

    @Override
    public int getWallpaperDesiredMinimumWidth() {
        return 0;
    }

    @Override
    public int getWallpaperDesiredMinimumHeight() {
        return 0;
    }

    @Override
    public void setWallpaper(Bitmap bitmap) throws IOException {

    }

    @Override
    public void setWallpaper(InputStream data) throws IOException {

    }

    @Override
    public void clearWallpaper() throws IOException {

    }

    @Override
    public void startActivity(Intent intent) {

    }

    @Override
    public void startActivity(Intent intent, @Nullable Bundle options) {

    }

    @Override
    public void startActivities(Intent[] intents) {

    }

    @Override
    public void startActivities(Intent[] intents, Bundle options) {

    }

    @Override
    public void startIntentSender(IntentSender intent, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {

    }

    @Override
    public void startIntentSender(IntentSender intent, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @Nullable Bundle options) throws IntentSender.SendIntentException {

    }

    @Override
    public void sendBroadcast(Intent intent) {

    }

    @Override
    public void sendBroadcast(Intent intent, @Nullable String receiverPermission) {

    }

    @Override
    public void sendOrderedBroadcast(Intent intent, @Nullable String receiverPermission) {

    }

    @Override
    public void sendOrderedBroadcast(@NonNull Intent intent, @Nullable String receiverPermission, @Nullable BroadcastReceiver resultReceiver, @Nullable Handler scheduler, int initialCode, @Nullable String initialData, @Nullable Bundle initialExtras) {

    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user) {

    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user, @Nullable String receiverPermission) {

    }

    @Override
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user, @Nullable String receiverPermission, BroadcastReceiver resultReceiver, @Nullable Handler scheduler, int initialCode, @Nullable String initialData, @Nullable Bundle initialExtras) {

    }

    @Override
    public void sendStickyBroadcast(Intent intent) {

    }

    @Override
    public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver, @Nullable Handler scheduler, int initialCode, @Nullable String initialData, @Nullable Bundle initialExtras) {

    }

    @Override
    public void removeStickyBroadcast(Intent intent) {

    }

    @Override
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle user) {

    }

    @Override
    public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user, BroadcastReceiver resultReceiver, @Nullable Handler scheduler, int initialCode, @Nullable String initialData, @Nullable Bundle initialExtras) {

    }

    @Override
    public void removeStickyBroadcastAsUser(Intent intent, UserHandle user) {

    }

    @Nullable
    @Override
    public Intent registerReceiver(@Nullable BroadcastReceiver receiver, IntentFilter filter) {
        return null;
    }

    @Nullable
    @Override
    public Intent registerReceiver(@Nullable BroadcastReceiver receiver, IntentFilter filter, int flags) {
        return null;
    }

    @Nullable
    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, @Nullable String broadcastPermission, @Nullable Handler scheduler) {
        return null;
    }

    @Nullable
    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, @Nullable String broadcastPermission, @Nullable Handler scheduler, int flags) {
        return null;
    }

    @Override
    public void unregisterReceiver(BroadcastReceiver receiver) {

    }

    @Nullable
    @Override
    public ComponentName startService(Intent service) {
        return null;
    }

    @Nullable
    @Override
    public ComponentName startForegroundService(Intent service) {
        return null;
    }

    @Override
    public boolean stopService(Intent service) {
        return false;
    }

    @Override
    public boolean bindService(Intent service, @NonNull ServiceConnection conn, int flags) {
        return false;
    }

    @Override
    public void unbindService(@NonNull ServiceConnection conn) {

    }

    @Override
    public boolean startInstrumentation(@NonNull ComponentName className, @Nullable String profileFile, @Nullable Bundle arguments) {
        return false;
    }

    @Override
    public Object getSystemService(@NonNull String name) {
        return null;
    }

    @Nullable
    @Override
    public String getSystemServiceName(@NonNull Class<?> serviceClass) {
        return null;
    }

    @SuppressLint("WrongConstant")
    @Override
    public int checkPermission(@NonNull String permission, int pid, int uid) {
        return 0;
    }

    @SuppressLint("WrongConstant")
    @Override
    public int checkCallingPermission(@NonNull String permission) {
        return 0;
    }

    @SuppressLint("WrongConstant")
    @Override
    public int checkCallingOrSelfPermission(@NonNull String permission) {
        return 0;
    }

    @SuppressLint("WrongConstant")
    @Override
    public int checkSelfPermission(@NonNull String permission) {
        return 0;
    }

    @Override
    public void enforcePermission(@NonNull String permission, int pid, int uid, @Nullable String message) {

    }

    @Override
    public void enforceCallingPermission(@NonNull String permission, @Nullable String message) {

    }

    @Override
    public void enforceCallingOrSelfPermission(@NonNull String permission, @Nullable String message) {

    }

    @Override
    public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {

    }

    @Override
    public void revokeUriPermission(Uri uri, int modeFlags) {

    }

    @Override
    public void revokeUriPermission(String toPackage, Uri uri, int modeFlags) {

    }

    @SuppressLint("WrongConstant")
    @Override
    public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
        return 0;
    }

    @SuppressLint("WrongConstant")
    @Override
    public int checkCallingUriPermission(Uri uri, int modeFlags) {
        return 0;
    }

    @SuppressLint("WrongConstant")
    @Override
    public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
        return 0;
    }

    @SuppressLint("WrongConstant")
    @Override
    public int checkUriPermission(@Nullable Uri uri, @Nullable String readPermission, @Nullable String writePermission, int pid, int uid, int modeFlags) {
        return 0;
    }

    @Override
    public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) {

    }

    @Override
    public void enforceCallingUriPermission(Uri uri, int modeFlags, String message) {

    }

    @Override
    public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) {

    }

    @Override
    public void enforceUriPermission(@Nullable Uri uri, @Nullable String readPermission, @Nullable String writePermission, int pid, int uid, int modeFlags, @Nullable String message) {

    }

    @Override
    public Context createPackageContext(String packageName, int flags) throws PackageManager.NameNotFoundException {
        return null;
    }

    @Override
    public Context createContextForSplit(String splitName) throws PackageManager.NameNotFoundException {
        return null;
    }

    @Override
    public Context createConfigurationContext(@NonNull Configuration overrideConfiguration) {
        return null;
    }

    @Override
    public Context createDisplayContext(@NonNull Display display) {
        return null;
    }

    @Override
    public Context createDeviceProtectedStorageContext() {
        return null;
    }

    @Override
    public boolean isDeviceProtectedStorage() {
        return false;
    }
}
