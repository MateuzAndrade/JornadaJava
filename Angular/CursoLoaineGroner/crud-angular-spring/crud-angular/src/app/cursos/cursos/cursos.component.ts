import { routes } from './../../app.routes';
import { CursosService } from './../services/cursos.service';
import { Component } from '@angular/core';
import { Curso } from '../model/curso';
import { MatTableModule } from '@angular/material/table';
import { MatCardModule } from '@angular/material/card';
import { MatToolbarModule } from '@angular/material/toolbar';
import { Observable, catchError, of } from 'rxjs';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { CommonModule } from '@angular/common';
import { error } from 'node:console';
import { MatDialog } from '@angular/material/dialog';
import { ErroDialogComponent } from '../../shared/components/erro-dialog/erro-dialog.component';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cursos',
  standalone: true,
  imports: [
    MatTableModule,
    MatCardModule,
    MatToolbarModule,
    MatProgressSpinnerModule,
    CommonModule,
    MatButtonModule,
    MatIconModule,
  ],
  templateUrl: './cursos.component.html',
  styleUrl: './cursos.component.scss',
})
export class CursosComponent {
  cursos$: Observable<Curso[]>;
  displayedColumns = ['nome', 'categoria', 'actions'];

  constructor(private cursosService: CursosService,
     public dialog: MatDialog,
      private router: Router) {
    this.cursos$ = this.cursosService.list().pipe(
      catchError((error) => {
        this.openError('Erro ao Carregar Cursos!');
        return of([]);
      })
    );
  }

  openError(erroMsg: String) {
    this.dialog.open(ErroDialogComponent, {
      data: erroMsg,
    });
  }

  onAdd() {
    this.router.navigate(['cursos/novo']);
  }
}
