package pilgrims.progress.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pilgrims.progress.PilgrimsProgress;

public class ModItems {
    //All items under public static final this is a requirement
    public static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Settings()) );


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PilgrimsProgress.MODID, name), item);
    }

     public static void registerModItems() {
            PilgrimsProgress.LOGGER.info("Registering Mod Items For" + PilgrimsProgress.MODID);

            //adding to item groups in creative inventory
         ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
             entries.add(TEST_ITEM);
         });
     }
}