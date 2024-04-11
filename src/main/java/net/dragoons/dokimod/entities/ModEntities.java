package net.dragoons.dokimod.entities;

import net.dragoons.dokimod.DokibirdMinecraftMod;
import net.dragoons.dokimod.constants.EntityIds;
import net.dragoons.dokimod.constants.Mod;
import net.dragoons.dokimod.entities.custom.ChonkyGoonEntity;
import net.dragoons.dokimod.entities.custom.DragoonEntity;
import net.dragoons.dokimod.entities.custom.LongGoonEntity;
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
                    .dimensions(EntityDimensions.fixed(0.7f, 0.7f))
                    .build()
    );

    public static final EntityType<ChonkyGoonEntity> ENTITY_CHONKY_GOON = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Mod.MOD_ID, EntityIds.ENTITY_CHONKY_GOON),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ChonkyGoonEntity::new)
                    .dimensions(EntityDimensions.fixed(1.6f, 1.6f))
                    .build()
    );

    public static final EntityType<LongGoonEntity> ENTITY_LONG_GOON = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Mod.MOD_ID, EntityIds.ENTITY_LONG_GOON),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, LongGoonEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f, 1.6f))
                    .build()
    );

    public static void registerModEntities() {
        DokibirdMinecraftMod.LOGGER.info("Registering Entities for " + Mod.MOD_ID);
    }
}
