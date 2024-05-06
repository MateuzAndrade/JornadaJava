import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogModule } from '@angular/material/dialog';
import { MatButtonModule } from '@angular/material/button';


@Component({
  selector: 'app-erro-dialog',
  standalone: true,
  imports: [MatDialogModule, MatButtonModule],
  templateUrl: './erro-dialog.component.html',
  styleUrl: './erro-dialog.component.scss',
})
export class ErroDialogComponent {
  constructor(@Inject(MAT_DIALOG_DATA) public data: String) { }

}
