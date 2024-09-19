package pilgrims.progress;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pilgrims.progress.Item.ModItems;

import static net.fabricmc.loader.impl.FabricLoaderImpl.MOD_ID;

public class PilgrimsProgress implements ModInitializer {
	public static final String MODID = "pilgrims";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}