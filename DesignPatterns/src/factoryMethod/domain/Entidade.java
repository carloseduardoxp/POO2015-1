package factoryMethod.domain;

import java.util.HashMap;
import java.util.Map;

public abstract class Entidade {
	
	protected Map<String,Object> mapa = new HashMap<String, Object>();
	
	public abstract Map<String, Object> getMapa();

}
