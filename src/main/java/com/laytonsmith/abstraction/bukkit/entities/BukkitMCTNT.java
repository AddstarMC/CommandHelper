package com.laytonsmith.abstraction.bukkit.entities;

import com.laytonsmith.abstraction.MCEntity;
import com.laytonsmith.abstraction.entities.MCTNT;
import org.bukkit.entity.Entity;
import org.bukkit.entity.TNTPrimed;

public class BukkitMCTNT extends BukkitMCEntity implements MCTNT {

	TNTPrimed tnt;

	public BukkitMCTNT(Entity e) {
		super(e);
		this.tnt = (TNTPrimed) e;
	}

	@Override
	public MCEntity getSource() {
		if(tnt.getSource() == null) {
			return null;
		}
		return new BukkitMCEntity(tnt.getSource());
	}

	@Override
	public void setSource(MCEntity source) {
		if(source == null) {
			tnt.setSource(null);
		} else {
			tnt.setSource((Entity) source.getHandle());
		}
	}

	@Override
	public int getFuseTicks() {
		return tnt.getFuseTicks();
	}

	@Override
	public void setFuseTicks(int ticks) {
		tnt.setFuseTicks(ticks);
	}
}
