import { CursosService } from './../services/cursos.service';
import { Component } from '@angular/core';
import { Curso } from '../model/curso';
import { MatTableModule } from '@angular/material/table'
import { MatCardModule } from '@angular/material/card';
import { MatToolbarModule } from '@angular/material/toolbar';



@Component({
  selector: 'app-cursos',
  standalone: true,
  imports: [MatTableModule, MatCardModule, MatToolbarModule],
  templateUrl: './cursos.component.html',
  styleUrl: './cursos.component.scss'
})
export class CursosComponent {

  cursos: Curso[] = [];
  displayedColumns = ['nome', 'categoria']

  cursosService: CursosService;

  constructor(){
//   this.cursos =[]

    this.cursosService = new CursosService();
    this.cursos = this.cursosService.list();
  }

}
