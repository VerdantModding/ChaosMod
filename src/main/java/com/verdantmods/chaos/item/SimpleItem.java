package com.verdantmods.chaos.item;

import com.verdantmods.chaos.Chaos;
import net.minecraft.world.item.Item;

/**
 * Add the item to the creative tab
 *
 */
public class SimpleItem extends Item {

    public SimpleItem(){
        super(new Item.Properties().tab(Chaos.GROUP));
    }

    public SimpleItem(Item.Properties properties) {
        super(properties.tab(Chaos.GROUP));
    }
}
