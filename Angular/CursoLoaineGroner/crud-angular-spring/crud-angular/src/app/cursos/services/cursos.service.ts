import { Injectable } from '@angular/core';
import { Curso } from '../model/curso';
import { HttpClient } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})

export class CursosService {

  constructor(private httpClient: HttpClient) { }

  list(): Curso[] {
    return [
      { _id: "1", nome: "Angular", categoria: "Front-end" }
    ];
  }
}
