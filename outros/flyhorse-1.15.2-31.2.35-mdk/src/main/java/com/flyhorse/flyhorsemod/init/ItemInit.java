package com.flyhorse.flyhorsemod.init;
import com.flyhorse.flyhorsemod.FlyHorseMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = FlyHorseMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(FlyHorseMod.MOD_ID)
public class ItemInit {

    public static final Item whistle_item = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("whistle_item"));
    }
}
