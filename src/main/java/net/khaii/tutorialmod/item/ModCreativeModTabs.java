package net.khaii.tutorialmod.item;

import net.khaii.tutorialmod.TutorialMod;
import net.khaii.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
//                        adding custom items to the creative tab
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.WAOS.get());
                        pOutput.accept(ModBlocks.ALTO_BLOCK.get());
                        pOutput.accept(ModBlocks.INCREIBLE_BLOCK.get());

//                        adding vanilla items to the creative tab
                        pOutput.accept(Items.DIAMOND);
                        pOutput.accept(Items.NETHERITE_PICKAXE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
