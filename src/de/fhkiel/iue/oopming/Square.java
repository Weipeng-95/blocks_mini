package de.fhkiel.iue.oopming;

import processing.core.PApplet;

public class Square extends GraphObject
{
    private float edgelength;

    public Square( Point pcenter, Color pcolor, float pedgelength )
    {
        super( pcenter, pcolor );
        edgelength = pedgelength;
    }

    @Override
    public void draw( PApplet papplet )
    {
        color.fill( papplet );
        papplet.square( center.getX() - edgelength / 2, center.getY() - edgelength / 2, edgelength );
    }
}
