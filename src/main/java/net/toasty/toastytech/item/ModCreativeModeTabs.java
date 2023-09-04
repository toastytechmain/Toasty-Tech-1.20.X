package net.toasty.toastytech.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.toasty.toastytech.ToastyTech;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ToastyTech.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TOASTY_TECH = CREATIVE_MODE_TABS.register("toasty_tech",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IRON_PLATE.get()))
                    .title(Component.translatable("creativetab.toasty_tech"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.IRON_PLATE.get());
                        pOutput.accept(ModItems.IRON_ROD.get());
                        pOutput.accept(ModItems.COPPER_ROD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
