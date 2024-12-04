package kr.ac.kumoh.s20210084.web24w14Backend.repository

import kr.ac.kumoh.s20210084.web24w14Backend.model.Song
import org.springframework.data.mongodb.repository.MongoRepository

interface SongRepository : MongoRepository<Song, String> {

    fun findBySinger(singer: String): List<Song>
}