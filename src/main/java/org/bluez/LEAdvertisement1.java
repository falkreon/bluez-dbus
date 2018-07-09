package org.bluez;

import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.Properties;

/**
 * File generated - 2018-03-08.<br>
 * Based on bluez Documentation: advertising-api.txt.<br>
 * <br>
 * <b>Service:</b> org.bluez<br>
 * <b>Interface:</b> org.bluez.LEAdvertisement1<br>
 * <br>
 * <b>Object path:</b><br>
 *             freely definable<br>
 * <br>
 * <b>Supported properties:</b> <br>
 * <br>
 * 		string Type<br>
 * <br>
 * 			Determines the type of advertising packet requested.<br>
 * <br>
 * 			Possible values: "broadcast" or "peripheral"<br>
 * <br>
 * 		array{string} ServiceUUIDs<br>
 * <br>
 * 			List of UUIDs to include in the "Service UUID" field of<br>
 * 			the Advertising Data.<br>
 * <br>
 * 		dict ManufacturerData<br>
 * <br>
 * 			Manufactuer Data fields to include in<br>
 * 			the Advertising Data.  Keys are the Manufacturer ID<br>
 * 			to associate with the data.<br>
 * <br>
 * 		array{string} SolicitUUIDs<br>
 * <br>
 * 			Array of UUIDs to include in "Service Solicitation"<br>
 * 			Advertisement Data.<br>
 * <br>
 * 		dict ServiceData<br>
 * <br>
 * 			Service Data elements to include. The keys are the<br>
 * 			UUID to associate with the data.<br>
 * <br>
 * 		array{string} Includes<br>
 * <br>
 * 			List of features to be included in the advertising<br>
 * 			packet.<br>
 * <br>
 * 			Possible values: as found on<br>
 * 					LEAdvertisingManager.SupportedIncludes<br>
 * <br>
 * 		string LocalName<br>
 * <br>
 * 			Local name to be used in the advertising report. If the<br>
 * 			string is too big to fit into the packet it will be<br>
 * 			truncated.<br>
 * <br>
 * 			If this property is available 'local-name' cannot be<br>
 * 			present in the Includes.<br>
 * <br>
 * 		uint16 Appearance<br>
 * <br>
 * 			Appearance to be used in the advertising report.<br>
 * <br>
 * 			Possible values: as found on GAP Service.<br>
 * <br>
 * 		uint16_t Duration<br>
 * <br>
 * 			Duration of the advertisement in seconds. If there are<br>
 * 			other applications advertising no duration is set the<br>
 * 			default is 2 seconds.<br>
 * <br>
 * 		uint16_t Timeout<br>
 * <br>
 * 			Timeout of the advertisement in seconds. This defines<br>
 * 			the lifetime of the advertisement.<br>
 * <br>
 * <br>
 */
public interface LEAdvertisement1 extends DBusInterface, Properties {

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * This method gets called when the service daemon<br>
     * removes the Advertisement. A client can use it to do<br>
     * cleanup tasks. There is no need to call<br>
     * UnregisterAdvertisement because when this method gets<br>
     * called it has already been unregistered.<br>
     * <br>
     */
    void Release();

}
