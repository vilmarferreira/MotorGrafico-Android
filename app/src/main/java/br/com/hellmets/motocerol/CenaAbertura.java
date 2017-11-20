package br.com.hellmets.motocerol;

import br.com.hellmets.motocerol.AndGraph.AGActivityGame;
import br.com.hellmets.motocerol.AndGraph.AGGameManager;
import br.com.hellmets.motocerol.AndGraph.AGInputManager;
import br.com.hellmets.motocerol.AndGraph.AGScene;
import br.com.hellmets.motocerol.AndGraph.AGScreenManager;
import br.com.hellmets.motocerol.AndGraph.AGSprite;
import br.com.hellmets.motocerol.AndGraph.AGTimeManager;
import br.com.hellmets.motocerol.AndGraph.AGTimer;
import br.com.hellmets.motocerol.AndGraph.AGTouchScreen;

/**
 * Created by vilmarferreira on 13/11/2017.
 */

public class CenaAbertura extends AGScene
{
    private AGTimer tempo= null;
    private AGSprite botaoOK=null;

    public CenaAbertura(AGGameManager manager)
    {
        super(manager);
    }

    @Override
    public void init() {
        //metodo chamado uma unica vez, qunado essa cena for rodar

        this.setSceneBackgroundColor(1,0,0);
        botaoOK= createSprite(R.mipmap.btnsobre,1,1);
        botaoOK.setScreenPercent(60,20);
        botaoOK.vrPosition.setX(AGScreenManager.iScreenWidth/2);
        botaoOK.vrPosition.setY(AGScreenManager.iScreenHeight/2);
        tempo = new AGTimer(3000);
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
        if(AGInputManager.vrTouchEvents.screenDragged())
        {
//
                botaoOK.vrPosition.setXY(AGInputManager.vrTouchEvents.getLastPosition().getX(),AGInputManager.vrTouchEvents.getLastPosition().getY());

                // vrGameManager.setCurrentScene(1);
                //                return;

        }
    }
}
