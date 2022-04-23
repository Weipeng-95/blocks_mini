package de.fhkiel.iue.oopming;

import processing.core.PApplet;

public class EquiTriangle extends GraphObject
{
    private float radius;

    public EquiTriangle( Point pcenter, Color pcolor, float pradius )
    {
        super( pcenter, pcolor );
        radius = pradius;
    }

    @Override
    public void draw( PApplet pApplet )
    {
        color.fill( pApplet );
        pApplet.triangle(
                center.getX(),     // x1
                center.getY() - radius / 2,    // y1
                (float) ( center.getX() + Math.cos( Math.PI / 12 ) * radius / 2 ),    // x2
                (float) ( center.getY() + Math.sin( Math.PI / 12 ) * radius / 2 ),    // y2
                (float) ( center.getX() - Math.cos( Math.PI / 12 ) * radius / 2 ),    // x3
                (float) ( center.getY() + Math.sin( Math.PI / 12 ) * radius / 2 )     // y3
        );
    }
}
