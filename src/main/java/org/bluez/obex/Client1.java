package org.bluez.obex;

import org.freedesktop.dbus.interfaces.DBusInterface;
import java.util.Map;
import org.bluez.exceptions.BluezFailedException;
import org.bluez.exceptions.BluezInvalidArgumentsException;
import org.bluez.exceptions.BluezNotAuthorizedException;

/**
 * File generated - 2018-03-08.<br>
 * Based on bluez Documentation: obex-api.txt.<br>
 * <br>
 * <b>Service:</b> org.bluez.obex<br>
 * <b>Interface:</b> org.bluez.obex.Client1<br>
 * <br>
 * <b>Object path:</b><br>
 *             /org/bluez/obex<br>
 * <br>
 */
public interface Client1 extends DBusInterface {

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Create a new OBEX session for the given remote address.<br>
     * <br>
     * The last parameter is a dictionary to hold optional or<br>
     * type-specific parameters. Typical parameters that can<br>
     * be set in this dictionary include the following:<br>
     * <br>
     * 	string "Target" : type of session to be created<br>
     * 	string "Source" : local address to be used<br>
     * 	byte "Channel"<br>
     * <br>
     * The currently supported targets are the following:<br>
     * <br>
     * 	"ftp"<br>
     * 	"map"<br>
     * 	"opp"<br>
     * 	"pbap"<br>
     * 	"sync"<br>
     * <br>
     * 
     * @param _destination
     * @param _args
     * 
     * @throws BluezInvalidArgumentsException
     * @throws BluezFailedException
     */
    Object CreateSession(String _destination, Map<?, ?> _args) throws BluezInvalidArgumentsException, BluezFailedException;

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Unregister session and abort pending transfers.<br>
     * <br>
     * 
     * @param _session
     * 
     * @throws BluezInvalidArgumentsException
     * @throws BluezNotAuthorizedException
     */
    void RemoveSession(Object _session) throws BluezInvalidArgumentsException, BluezNotAuthorizedException;

}
