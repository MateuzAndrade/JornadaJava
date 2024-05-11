import { Injectable } from '@angular/core';
import { Curso } from '../model/curso';
import { HttpClient } from '@angular/common/http';
import { delay, first, tap } from 'rxjs';
import { CommonModule } from '@angular/common';



@Injectable({
  providedIn: 'root',
})
export class CursosService {

  private readonly API = 'http://localhost:8080/api/cursos';

  constructor(private httpClient: HttpClient) {}

  list() {
    return this.httpClient.get<Curso[]>(this.API).pipe(first(), delay(0));
  }
}
