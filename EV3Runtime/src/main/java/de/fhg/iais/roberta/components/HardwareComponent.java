package de.fhg.iais.roberta.components;

import de.fhg.iais.roberta.util.dbc.Assert;

abstract public class HardwareComponent {
    private HardwareComponentType componentType;

    public HardwareComponent() {
        super();
    }

    /**
     * Set a component type
     *
     * @param componentType
     */
    public void setComponentType(HardwareComponentType componentType) {
        this.componentType = componentType;
    }

    /**
     * @return type of the hardware component
     */
    public HardwareComponentType getComponentType() {
        Assert.isTrue(this.componentType != null, "Hardware type is null!");
        return this.componentType;
    }

    /**
     * @return type of the hardware component name
     */
    public String getComponentTypeName() {
        Assert.isTrue(this.componentType != null, "Hardware type is null!");
        return this.componentType.getTypeName();
    }

    /**
     * @return category in which the component belongs
     */
    public Category getCategory() {
        return this.componentType.getCategory();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.componentType == null) ? 0 : this.componentType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj ) {
            return true;
        }
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        HardwareComponent other = (HardwareComponent) obj;
        if ( this.componentType == null ) {
            if ( other.componentType != null ) {
                return false;
            }
        } else if ( !this.componentType.equals(other.componentType) ) {
            return false;
        }
        return true;
    }
}
