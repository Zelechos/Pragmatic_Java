/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.com470.lab4.model;

import java.util.Objects;

public class MinimoMaximo {
    public Integer min;
    public Integer max;

    public MinimoMaximo() {
    }

    public MinimoMaximo(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.min);
        hash = 37 * hash + Objects.hashCode(this.max);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MinimoMaximo other = (MinimoMaximo) obj;
        if (!Objects.equals(this.min, other.min)) {
            return false;
        }
        if (!Objects.equals(this.max, other.max)) {
            return false;
        }
        return true;
    }

    
    
    
   
}
