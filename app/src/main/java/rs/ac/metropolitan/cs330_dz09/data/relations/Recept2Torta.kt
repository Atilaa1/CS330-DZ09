package rs.ac.metropolitan.cs330_dz09.data.relations

import androidx.room.Entity

@Entity(primaryKeys = ["tortaId", "receptId"])
data class Recept2Torta (
    val tortaId: Int,
    val receptId: Int
)