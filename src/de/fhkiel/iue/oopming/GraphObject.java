package de.fhkiel.iue.oopming;

import processing.core.PApplet;

abstract public class GraphObject
{
    Point center;
    Color color;

    public GraphObject( Point pcenter, Color pcolor )
    {
        center = pcenter;
        color = pcolor;
    }

    abstract public void draw( PApplet pApplet );
}
