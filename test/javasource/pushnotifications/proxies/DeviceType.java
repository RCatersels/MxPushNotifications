// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

public enum DeviceType
{
	Android(new String[][] { new String[] { "en_US", "Android" }, new String[] { "nl_NL", "Android" } }),
	iOS(new String[][] { new String[] { "en_US", "IOS" }, new String[] { "nl_NL", "iOS" } }),
	Windows(new String[][] { new String[] { "en_US", "Windows" } });

	private java.util.Map<String,String> captions;

	private DeviceType(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
