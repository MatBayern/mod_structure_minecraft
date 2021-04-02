
package net.mcreator.sturcturemodv.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.sturcturemodv.ElementsSturcturemodv;

@ElementsSturcturemodv.ModElement.Tag
public class LootTableTest extends ElementsSturcturemodv.ModElement {
	public LootTableTest(ElementsSturcturemodv instance) {
		super(instance, 11);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("sturcturemodv", "test"));
	}
}
