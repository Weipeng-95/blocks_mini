package de.fhkiel.iue.oopming;

import processing.core.PApplet;

public class Circle extends GraphObject
{
    private float radius;

    public Circle( Point pcenter, Color pcolor, float pradius )
    {
        super( pcenter, pcolor );
        radius = pradius;
    }

    @Override
    public void draw( PApplet papplet )
    {
        color.fill( papplet );
        color.stroke(papplet);
        papplet.circle( center.getX(), center.getY(), radius );
    }
}
