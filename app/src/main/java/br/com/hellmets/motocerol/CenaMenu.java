package br.com.hellmets.motocerol;

import br.com.hellmets.motocerol.AndGraph.AGGameManager;
import br.com.hellmets.motocerol.AndGraph.AGInputManager;
import br.com.hellmets.motocerol.AndGraph.AGScene;
import br.com.hellmets.motocerol.AndGraph.AGScreenManager;
import br.com.hellmets.motocerol.AndGraph.AGSprite;

/**
 * Created by vilmarferreira on 13/11/2017.
 */

public class CenaMenu extends AGScene
{
    AGSprite capacete =null;
    AGSprite gato= null;
    int i;
    int dir=1 ;
    public CenaMenu(AGGameManager manager)
    {
        super(manager);
    }

    @Override
    public void init() {
        //metodo chamado uma unica vez, qunado essa cena for rodar

        this.setSceneBackgroundColor(0,1,0);
        i=AGScreenManager.iScreenHeight/2;
        gato=createSprite(R.mipmap.cat,2,4);
        gato.setScreenPercent(40,20);
        gato.vrPosition.setX(AGScreenManager.iScreenWidth/2);
        gato.vrPosition.setY(AGScreenManager.iScreenHeight/2);
        gato.addAnimation(30,true,0,7);
//        capacete=this.createSprite(R.mipmap.versocarta,1,1);
//        capacete.setScreenPercent(50,50);
//        capacete.vrPosition.setX(AGScreenManager.iScreenWidth/2);
//        capacete.vrPosition.setY(AGScreenManager.iScreenHeight/2);
    }

    @Override
    public void restart() {
        // vai restaurar o status da tela

    }

    @Override
    public void stop() {
        // Se alguma coisa chegar a atrapalhar, o app vai parar aqui

    }

    @Override
    public void loop()
    {
        //onDrawFrame
        if(AGInputManager.vrTouchEvents.screenClicked())
        {
            vrGameManager.vrActivity.finish();
        }


        if(gato.vrPosition.getX()> AGScreenManager.iScreenHeight ) {
            dir *= -1;
            gato.iMirror= AGSprite.HORIZONTAL;
        }
        if( gato.vrPosition.getX()< -gato.getSpriteHeight())
        {
            dir *= -1;
            gato.iMirror= AGSprite.NONE;
        }
            i+=5*dir;

        gato.vrPosition.setX(i);
    }
}
