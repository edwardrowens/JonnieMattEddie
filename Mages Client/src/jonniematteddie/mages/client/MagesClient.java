package jonniematteddie.mages.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

public class MagesClient implements ApplicationListener {

	@Override
	public void create() {
		Gdx.input.setInputProcessor(new ClientInputProcessor());
	}


	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
	}


	@Override
	public void render() {
		// TODO Auto-generated method stub
	}


	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}


	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}


	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
}