
public enum ParaType {
	AUTEUR("auteur"),ID("id"),NAME("name"),SPECIAL("special"),ERREUR("erreur");
	
	private String scode;
	private ParaType(String _scode){
		scode = _scode;
	}
	
	@Override
	public String toString(){
		return scode;
	}
}