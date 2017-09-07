using System;

namespace PSP.labExercises.Instruments
{
    class Guitar : MusicInstrument
    {
        protected override void Play()
        {
            Console.WriteLine("Guitar is playing beautiful music :)");
        }
        protected override void Tune()
        {
            Console.WriteLine("Guitar strings are tuned");
        }
    }
}
