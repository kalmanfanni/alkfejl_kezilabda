import { Poszt } from './poszt_en';

export interface Jatekos {
    id: number;
    nev: string;
    mezszam: number;
    szuletesi_ido: Date;
    poszt: Poszt;
}


