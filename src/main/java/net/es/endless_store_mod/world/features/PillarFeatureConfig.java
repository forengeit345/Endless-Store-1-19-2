package net.es.endless_store_mod.world.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.FeatureConfig;

public record PillarFeatureConfig(BlockState blockState) implements FeatureConfig {
    public static final Codec<PillarFeatureConfig> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(BlockState.CODEC.fieldOf("block").forGetter(PillarFeatureConfig::blockState)).apply(instance, PillarFeatureConfig::new)
    );
}