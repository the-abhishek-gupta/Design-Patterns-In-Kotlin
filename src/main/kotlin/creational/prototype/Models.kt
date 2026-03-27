package org.example.creational.prototype

data class ProtoUser(val name: String, val address: ProtoAddress) : Prototype<ProtoUser> {
    override fun clone(): ProtoUser {
        return copy(address = address.copy())
    }
}

data class ProtoAddress(val city: String, val pincode: String)
