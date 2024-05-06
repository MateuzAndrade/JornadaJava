import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CursosRoutingModule } from './cursos-routing.module';
import { HttpClientModule, provideHttpClient, withFetch } from '@angular/common/http';
import { CursosService } from './services/cursos.service';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    CursosRoutingModule,
    HttpClientModule
  ],
  providers: [CursosService, provideHttpClient(withFetch())]
})
export class CursosModule { }
