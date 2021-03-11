

import java.io.Serializable;

public class Language implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private int langID;
	private String langName;
	
	Language()
	{
		langID=0;
		langName="";
	}

	Language(int id, String name)
	{
		this.langID=id;
		this.langName=name;
	}
	
	public int getLangID()
	{
		return langID;
	}

	public void setLangID(int langID) 
	{
		this.langID = langID;
	}

	public String getLangName() 
	{
		return langName;
	}

	public void setLangName(String langName) 
	{
		this.langName = langName;
		if(langName.equalsIgnoreCase("english"))
			this.setLangID(1);
		if(langName.equalsIgnoreCase("hindi"))
			this.setLangID(2);
		if(langName.equalsIgnoreCase("marathi"))
			this.setLangID(3);
	}
	
	

}

