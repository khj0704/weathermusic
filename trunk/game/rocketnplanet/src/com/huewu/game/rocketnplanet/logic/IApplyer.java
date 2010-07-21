package com.huewu.game.rocketnplanet.logic;

import com.huewu.game.rocketnplanet.RenderableList;

public interface IApplyer {
	public void setTargets(RenderableList renderable);
	public void apply(float timeDelta);
}//end of interface
