
 PASTA MANIFEST
    Esta pasta serve para demonstrar tudo que seu programa irá utlizar para o android (uso da galeria, Câmera, etc). É exatamente a tela que surge quando vamos instalar um aplicativo e antes da instalação emite um alerta de que aquele programa irá usar determinadas aplicações do androide.

 ACTIVITY É TODA A PARTE VISUAL DE SUA APLICAÇÃO
    Quando você abre o facebook ou o instagram, toda a parte visual é uma activity

      Activits são separadas em duas partes:
            - A primeira é a MainActivity contida neste diretório e CUIDA da parte LÓGICA do layout;
            - A segunda é uma contida em res > Layout > activity_main.xml que CUIDA da parte VISUAL
      São ligadas entre si pelo comando:
            setContentView(R.layout.activity_main);
     contido no MainActivity

 RESOURCES
    -DRAWABLE - pasta que mantém os arquivos de icones, imagens, tudo que será usado visualmente
    - Mipmap - outros tipos de imagens
    - Values - Configurações de latout (cores, Fontes e diversos outros

 GRADLE - BUILD GLADE GERENCIA BIBLIOTECAS (INCLUSIVE HARDWARE), ALÉM DE CONTER INFORMAÇÕES QUE DIZ RESPEITO ÀS VERSÕES DO PROGRAMA

