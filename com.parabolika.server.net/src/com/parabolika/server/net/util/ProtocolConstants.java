package com.parabolika.server.net.util;

public interface ProtocolConstants {
	public static final int PACKET_SIZE_BYTE = -1;
	public static final int PACKET_SIZE_SHORT = -2;

	// XXX: Refactor out the giant arrays (config file?)
	public static final int[] INCOMING_PACKET_LENGTHS = {
		0, 0, 0, 1, -1, 0, 0, 0, 0, 0,  // 0
		0, 0, 0, 0, 1, 0, -1, 0, -1, 0, // 10
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 20
		0, 0, 0, 0, 0, 0, 4, 0, 0, 0,   // 30
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 40
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 50
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 60
		0, 0, 0, 0, 0, 0, 0, -1, 0, 0,  // 70
		0, 0, 0, 0, 0, 0, 4, 5, 0, 0,   // 80
		0, 0, 0, 0, 0, 0, 0, 0, -1, 0,  // 90
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 100
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 110
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 120
		0, 0, 6, 0, 0, 0, 0, 0, 0, 0,   // 130
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 140
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 150
		0, 0, 0, 0, -1, 0, 0, 0, 0, 0,  // 160
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 170
		0, 0, 0, 0, 0, 2, 0, 0, 0, 0,   // 180
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 190
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 200
		4, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 210
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 220
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   // 230
		0, 4, 0, 0, 0, 0, 0, 0, -1, 0,  // 240
		0, 0, 6, 0                      // 250
	};

	public static final int[] OUTGOING_PACKET_SIZES = {
		0, 0, 0, 0, 6, 0, 0, 0, 4, 0,
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 1, 0, 0, 0, 0, 0,
		0, 0, 0, 0, -2, 4, 3, 0, 0, 0,
		0, 0, 0, 0, 5, 0, 0, 6, 0, 0,
		9, 0, 0, -2, 0, 0, 0, 0, 0, 0,
		-2, 1, 0, 0, 2, -2, 0, 0, 0, 0,
		6, 3, 2, 4, 2, 4, 0, 0, 0, 4,
		0, -2, 0, 0, 7, 2, 0, 6, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 2, 0, 1,
		0, 2, 0, 0, -1, 4, 1, 0, 0, 0,
		1, 0, 0, 0, 2, 0, 0, 15, 0, 0,
		0, 4, 4, 0, 0, 0, -2, 0, 0, 0,
		0, 0, 0, 0, 6, 0, 0, 0, 0, 0,
		0, 0, 2, 0, 0, 0, 0, 14, 0, 0,
		0, 4, 0, 0, 0, 0, 3, 0, 0, 0,
		4, 0, 0, 0, 2, 0, 6, 0, 0, 0,
		0, 3, 0, 0, 5, 0, 10, 6, 0, 0,
		0, 0, 0, 0, 0, 2, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, -1, 0, 0, 0,
		4, 0, 0, 0, 0, 0, 3, 0, 2, 0,
		0, 0, 0, 0, -2, 7, 0, 0, 2, 0,
		0, 1, 0, 0, 0, 0, 0, 0, 0, 0,
		8, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		2, -2, 0, 0, 0, 0, 6, 0, 4, 3,
		0, 0, 0, -1, 6, 0, 0
	};
}
