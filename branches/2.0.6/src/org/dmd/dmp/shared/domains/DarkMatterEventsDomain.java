package org.dmd.dmp.shared.domains;

import de.novanic.eventservice.client.event.domain.Domain;
import de.novanic.eventservice.client.event.domain.DomainFactory;

/**
 * The DarkMatterEventsDomain is used in conjunction with the GWT Event Service
 * mechanisms. It defines the name of a generic event channel for publishing events
 * associated with the Dark Matter Protocol.
 * <P>
 * This domain is used by the org.dmd.features.extgwt.client.extended.ServerEventController
 * to register for Dark Matter Events.
 * <P>
 * Currently, all events are published to the same channel, but we could create different
 * channels for different types of events if required.
 */
public class DarkMatterEventsDomain {

	public static final Domain DOMAIN = DomainFactory.getDomain("darkMatterEvents");
	
}
