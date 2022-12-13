import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Experiencia } from 'src/app/model/experiencia';
import { SExperienciaService } from 'src/app/service/s-experiencia.service';

@Component({
  selector: 'app-new-experiencia',
  templateUrl: './new-experiencia.component.html',
  styleUrls: ['./new-experiencia.component.css']
})

export class NewExperienciaComponent implements OnInit {
[x: string]: any;
  nombreE: string = '';
  descripcionE: string = '';
 
constructor(private sExperiencia: SExperienciaService, private router: Router) { }

ngOnInit(): void {
}

OnCreate(): void {
const expe = new Experiencia(this.nombreE, this.descripcionE);
this.sExperiencia.save(expe).subscribe(data=>{
  alert("Experiencia añadida") 
      },err =>{
        alert("Fallò");
        this.router.navigate(['']);

      }
    )
  }
}