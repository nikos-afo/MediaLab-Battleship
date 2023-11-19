package com.afordakos_nik.medialab_battleship.dataStructures.ship;

import com.afordakos_nik.medialab_battleship.dataStructures.ShipPosition;

public class Carrier extends Ship
{
	public Carrier(int x, int y, boolean isHorizontal)
	{
		super();
		
		setShipType(ShipType.CARRIER);
		setShipState(ShipState.OPERATING);
		
		setShipSize(5);
		setSuccessfulShotPoints(350);
		setBonusPoints(1000);
		
		setCssClass("carrier-cell");
		
		setShipPosition(new ShipPosition(x, y, isHorizontal));
	}
}
