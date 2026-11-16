package net.acoyt.tech_mod.impl.index;

import net.acoyt.acornlib.api.registrants.CreativeModeTabRegistrant;
import net.acoyt.tech_mod.impl.TechMod;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * @author AcoYT
 */
public interface TMCreativeModeTabs {
    CreativeModeTabRegistrant TABS = new CreativeModeTabRegistrant(TechMod.MOD_ID);

    CreativeModeTab MAIN = TABS.register("main", FabricCreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tech_mod.main"))
            .icon(() -> new ItemStack(TMItems.LOGIC_INGOT))
            .displayItems(TMCreativeModeTabs::addEntries)
            .build());

    static void init() {}

    private static void addEntries(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
        output.accept(TMItems.LOGIC_INGOT);

        output.accept(TMItems.GOGGLES);
        output.accept(TMItems.LOGIC_CHESTPLATE);
        output.accept(TMItems.LOGIC_LEGGINGS);
        output.accept(TMItems.LOGIC_BOOTS);

        output.accept(TMItems.CHECKPOINT);
    }
}
