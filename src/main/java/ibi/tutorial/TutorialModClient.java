package ibi.tutorial;

import net. fabricmc. api. ClientModInitializer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System. out. println("Hello Fabric world! (client)");
    }
}
