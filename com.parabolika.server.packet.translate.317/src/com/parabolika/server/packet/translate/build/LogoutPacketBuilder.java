package com.parabolika.server.packet.translate.build;

import com.parabolika.server.common.Packet;
import com.parabolika.server.packet.packets.IPacketRepresentation;
import com.parabolika.server.packet.packets.LogoutPacket;
import com.parabolika.server.packet.translate.IPacketBuilder;
import com.parabolika.server.packet.translate.annotate.BuildsPacket;

@BuildsPacket(LogoutPacket.class)
public class LogoutPacketBuilder implements IPacketBuilder {
	@Override
	public Packet build(IPacketRepresentation packetRep) {
		return new Packet(109, new byte[0]);
	}
}
