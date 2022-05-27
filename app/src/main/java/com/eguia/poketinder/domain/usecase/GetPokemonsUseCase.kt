package com.eguia.poketinder.domain.usecase

import com.eguia.poketinder.data.PokemonRepository
import com.eguia.poketinder.domain.model.Pokemon
import javax.inject.Inject


class GetPokemonsUseCase @Inject constructor(private val repository: PokemonRepository){
    suspend operator fun invoke():List<Pokemon>{
        return repository.getAllPokemonFromApi()
    }
}