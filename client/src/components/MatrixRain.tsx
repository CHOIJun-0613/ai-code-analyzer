import React, { useEffect, useRef } from 'react';

interface MatrixRainProps {
    className?: string;
}

const MatrixRain: React.FC<MatrixRainProps> = ({ className = '' }) => {
    const canvasRef = useRef<HTMLCanvasElement>(null);

    useEffect(() => {
        const canvas = canvasRef.current;
        if (!canvas) return;

        const ctx = canvas.getContext('2d');
        if (!ctx) return;

        let animationFrameId: number;

        const resizeCanvas = () => {
            if (canvas.parentElement) {
                canvas.width = canvas.parentElement.clientWidth;
                canvas.height = canvas.parentElement.clientHeight;
            }
        };

        resizeCanvas();
        window.addEventListener('resize', resizeCanvas);

        // Matrix characters - Hangul + Latin + Numerals
        const chars = 'ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎㅏㅑㅓㅕㅗㅛㅜㅠㅡㅣ가나다라마바사아자차카타파하0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ';
        const charArray = chars.split('');

        const fontSize = 14;
        const columns = Math.ceil(canvas.width / fontSize);

        // Array of drops - one per column
        const drops: number[] = [];
        for (let i = 0; i < columns; i++) {
            drops[i] = Math.floor(Math.random() * -100); // Random start positions above canvas
        }

        const draw = () => {
            // Black background with opacity for trail effect
            // Using a very low opacity creates a longer trail
            ctx.fillStyle = 'rgba(0, 0, 0, 0.05)';
            ctx.fillRect(0, 0, canvas.width, canvas.height);

            ctx.fillStyle = '#0F0'; // Green text
            // Use system sans-serif stack to match the UI labels (Malgun Gothic on Windows)
            ctx.font = `500 ${fontSize}px "Malgun Gothic", "Apple SD Gothic Neo", "Segoe UI", sans-serif`;

            for (let i = 0; i < drops.length; i++) {
                // Random character
                const text = charArray[Math.floor(Math.random() * charArray.length)];

                // x = column index * font size, y = drop value * font size
                const x = i * fontSize;
                const y = drops[i] * fontSize;

                // Color variation for a more dynamic look (some lighter, some darker green)
                const isHead = Math.random() > 0.95;
                if (isHead) {
                    ctx.fillStyle = '#FFF'; // Bright white head
                } else {
                    ctx.fillStyle = '#0F0'; // Standard green
                }

                ctx.fillText(text, x, y);

                // Reset drop to top randomly to creating scatter effect
                if (y > canvas.height && Math.random() > 0.975) {
                    drops[i] = 0;
                }

                drops[i]++;
            }

            setTimeout(() => {
                animationFrameId = requestAnimationFrame(draw);
            }, 33); // ~30FPS (Half speed)
        };

        draw();

        return () => {
            window.removeEventListener('resize', resizeCanvas);
            cancelAnimationFrame(animationFrameId);
        };
    }, []);

    return <canvas ref={canvasRef} className={className} />;
};

export default MatrixRain;
