package net.dragoons.dokimod.entities;

import net.dragoons.dokimod.DokibirdMinecraftMod;
import net.dragoons.dokimod.constants.EntityIds;
import net.dragoons.dokimod.constants.Mod;
import net.dragoons.dokimod.entities.custom.DragoonEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEntities {
    public static final EntityType<DragoonEntity> ENTITY_DRAGOON = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Mod.MOD_ID, EntityIds.ENTITY_DRAGOON),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DragoonEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f))
                    .build()
    );

    public static void registerModEntities() {
        DokibirdMinecraftMod.LOGGER.info("Registering Entities for " + Mod.MOD_ID);
    }
}
