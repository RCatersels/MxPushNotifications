// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package pushnotifications.actions;

import pushnotifications.implementation.gcm.GCMConnection;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class SendGoogleMessages extends CustomJavaAction<Boolean>
{
	private java.util.List<IMendixObject> __messages;
	private java.util.List<pushnotifications.proxies.GoogleMessage> messages;

	public SendGoogleMessages(IContext context, java.util.List<IMendixObject> messages)
	{
		super(context);
		this.__messages = messages;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.messages = new java.util.ArrayList<pushnotifications.proxies.GoogleMessage>();
		if (__messages != null)
			for (IMendixObject __messagesElement : __messages)
				this.messages.add(pushnotifications.proxies.GoogleMessage.initialize(getContext(), __messagesElement));

		// BEGIN USER CODE
		GCMConnection connection = GCMConnection.getConnection();
		connection.sendMessage(messages);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "SendGoogleMessages";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
