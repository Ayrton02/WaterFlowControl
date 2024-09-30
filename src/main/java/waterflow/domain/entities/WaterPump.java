package waterflow.domain.entities;

import core.baseclasses.BaseEntity;
import core.valueobjects.ID;
import core.valueobjects.UUID;
import waterflow.domain.valueobjects.Volume;
import waterflow.domain.valueobjects.VolumeFlow;

public abstract class WaterPump<T extends Volume<T>> extends BaseEntity {
    private VolumeFlow<T> volumeFlow;
    private boolean isActive = false;

    protected WaterPump(
            ID id,
            VolumeFlow<T> volumeFlow
    ) {
        super(id);
        this.volumeFlow = volumeFlow;
    }

    protected WaterPump(
            VolumeFlow<T> volumeFlow
    ) {
        super(UUID.generate());
        this.volumeFlow = volumeFlow;
    }

    public void start() {
        this.isActive = true;
    }

    public void stop() {
        this.isActive = false;
    }

    public boolean isActive() {
        return this.isActive;
    }
}