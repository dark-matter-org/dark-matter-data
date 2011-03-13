package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcValueException;

/**
 * The UUIDLite class is meant to hold two long values that represent a complete
 * java.util.UUID. The UUID class isn't supported in GWT, so this class merely 
 * stores the results of generating a UUID on the server.
 * <P>
 * The methods to parse a UUID from a String and present it as a String are taken
 * from the java.util.UUID class.
 * http://www.docjar.com/html/api/java/util/UUID.java.html
 */
@SuppressWarnings("serial")
public class UUIDLite implements Comparable<Object>, Serializable {

	long mostSigBits;
	long leastSigBits;
	transient String	asString;
	int hash;
	
	public UUIDLite(){
		mostSigBits 	= 0;
		leastSigBits 	= 0;
		asString 		= null;
		hash			= -1;
	}
	
	public UUIDLite(String s) throws DmcValueException {
		parseString(s);
		asString 		= null;
		hash			= -1;
	}
	
	public UUIDLite(UUIDLite u){
		mostSigBits 	= u.mostSigBits;
		leastSigBits 	= u.leastSigBits;
		asString 		= null;
		hash			= -1;
	}
	
	public UUIDLite(long msb, long lsb){
		mostSigBits 	= msb;
		leastSigBits 	= lsb;
		asString 		= null;
		hash			= -1;
	}
	
	public long getMostSignificantBits(){
		return(mostSigBits);
	}

	public long getLeastSignificantBits(){
		return(leastSigBits);
	}
	
	void initHash(){
		int msbHash = (int) (mostSigBits ^ (mostSigBits >>> 32));
		int lsbHash = (int) (leastSigBits ^ (leastSigBits >>> 32));
		hash = msbHash ^ lsbHash;
	}
	
	@Override
	public int hashCode(){
		if (hash == -1)
			initHash();
		return(hash);
	}

	/**
	 * <p>
	 * Parses a UUID string with the format defined by {@link #toString()}.
	 * 
	 * @param uuid
	 *            the UUID string to parse.
	 * @return an UUID instance.
	 * @throws DmcValueException 
	 * @throws NullPointerException
	 *             if {@code uuid} is {@code null}.
	 * @throws IllegalArgumentException
	 *             if {@code uuid} is not formatted correctly.
	 */
	private void parseString(String uuid) throws DmcValueException {
		if (uuid == null) {
			throw new NullPointerException();
		}

		int[] position = new int[5];
		int lastPosition = 1;
		int startPosition = 0;

		int i = 0;
		for (; i < position.length && lastPosition > 0; i++) {
			position[i] = uuid.indexOf("-", startPosition); //$NON-NLS-1$
			lastPosition = position[i];
			startPosition = position[i] + 1;
		}

		// should have and only can have four "-" in UUID
		if (i != position.length || lastPosition != -1) {
			throw(new DmcValueException("String does not conform to UUID format: " + uuid));
		}

		long m1 = Long.parseLong(uuid.substring(0, position[0]), 16);
		long m2 = Long.parseLong(uuid.substring(position[0] + 1, position[1]),
				16);
		long m3 = Long.parseLong(uuid.substring(position[1] + 1, position[2]),
				16);

		long lsb1 = Long.parseLong(
				uuid.substring(position[2] + 1, position[3]), 16);
		long lsb2 = Long.parseLong(uuid.substring(position[3] + 1), 16);

		mostSigBits = (m1 << 32) | (m2 << 16) | m3;
		leastSigBits = (lsb1 << 48) | lsb2;

	}
	
	/**
	 * Returns a string representation of this UUID in the following format, as
	 * per <a href="http://www.ietf.org/rfc/rfc4122.txt">RFC 4122</a>.
	 */
	@Override
	public String toString() {
		if (asString == null){
			StringBuilder builder = new StringBuilder(36);
			String msbStr = Long.toHexString(mostSigBits);
			if (msbStr.length() < 16) {
				int diff = 16 - msbStr.length();
				for (int i = 0; i < diff; i++) {
					builder.append('0');
				}
			}
			builder.append(msbStr);
			builder.insert(8, '-');
			builder.insert(13, '-');
			builder.append('-');
			String lsbStr = Long.toHexString(leastSigBits);
			if (lsbStr.length() < 16) {
				int diff = 16 - lsbStr.length();
				for (int i = 0; i < diff; i++) {
					builder.append('0');
				}
			}
			builder.append(lsbStr);
			builder.insert(23, '-');
			
			asString = builder.toString();
		}
		
		return(asString);
	}

	/**
	 * <p>
	 * Compares this UUID to the specified UUID. The natural ordering of UUIDs
	 * is based upon the value of the bits from most significant to least
	 * significant.
	 * 
	 * @param uuid
	 *            the UUID to compare to.
	 * @return a value of -1, 0 or 1 if this UUID is less than, equal to or
	 *         greater than {@code uuid}.
	 */
	public int compareTo(Object obj) {
		int rc = -1;
		
		if (obj == this) {
			rc = 0;
		}
		else if (obj instanceof UUIDLite){
			UUIDLite uuid = (UUIDLite) obj;
			if (this.mostSigBits != uuid.mostSigBits) {
				return this.mostSigBits < uuid.mostSigBits ? -1 : 1;
			}
	
			if (mostSigBits == uuid.mostSigBits){
	
				if (this.leastSigBits != uuid.leastSigBits) {
					return this.leastSigBits < uuid.leastSigBits ? -1 : 1;
				}
		
				if (leastSigBits == uuid.leastSigBits)
					rc = 0;
			}
		}
		
		return(rc);
	}
	 
	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}

		if (this == object) {
			return true;
		}

		if (!(object instanceof UUIDLite)) {
			return false;
		}

		UUIDLite that = (UUIDLite) object;

		return (this.leastSigBits == that.leastSigBits)
				&& (this.mostSigBits == that.mostSigBits);
	}

}
