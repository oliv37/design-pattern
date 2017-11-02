package org.design.pattern.behavioral.command;

import java.util.Arrays;
import java.util.List;

//client
public class CommandDemo {

    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);
        // lightSwitch.storeAndExecute(toggleCommand);
        // lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = Arrays.asList(bedroomLight, kitchenLight);
        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }

}
