package net.dragoons.dokimod.entities.custom;

import net.dragoons.dokimod.entities.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class DragoonEntity extends AnimalEntity {

    public static final double NORMAL_SPEED = 1.150;
    public static final double PANIC_SPEED = 1.5;

    public DragoonEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // For swimming
        this.goalSelector.add(0, new SwimGoal(this));
        // For breeding
        this.goalSelector.add(1, new AnimalMateGoal(this, 1.150));
        // For feeding
        this.goalSelector.add(2, new TemptGoal(this, 1.250, Ingredient.ofItems(Items.WHEAT_SEEDS), false));
        // For following player (?)
        this.goalSelector.add(3, new FollowParentGoal(this, 1.150));
        // For just wandering around and chill
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 10));
        // For looking at player if close
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        // For looking around
        this.goalSelector.add(6, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createDragoonAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5f)
                .add(EntityAttributes.GENERIC_ARMOR, 0.1f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1);

    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.ENTITY_DRAGOON.create(world);
    }
}
