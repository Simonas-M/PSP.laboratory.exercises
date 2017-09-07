namespace PSP.labExercises
{
    abstract class MusicInstrument
    {
        public void PlayInstrument()
        {
            Tune();
            Play();
        }

        protected abstract void Play();

        protected abstract void Tune();
    }
}
